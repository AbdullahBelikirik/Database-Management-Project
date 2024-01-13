CREATE SEQUENCE user_sequence START 1;

CREATE TABLE users (
    ID INT DEFAULT nextval('user_sequence') PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255),
    password VARCHAR(255),
    address VARCHAR(255),
    telNo VARCHAR(15),
    userName VARCHAR(50)
);


CREATE SEQUENCE prod_sequence START 1;

CREATE TABLE APPLICATION(
    applicantID INT,
    referencedID INT,
    date DATE,
    adID INT
);


CREATE TABLE Products(
    ID INT DEFAULT nextval('prod_sequence') PRIMARY KEY,
    count INT,
    name VARCHAR(255),
    price INT,
    CONSTRAINT price_bound check (price is null or (price >= 0))
);


CREATE SEQUENCE ad_sequence START 1;

CREATE TABLE ad (
    ID INT DEFAULT nextval('ad_sequence') PRIMARY KEY,
    address VARCHAR(255),
    description VARCHAR(255),
    age INT,
    sex VARCHAR(10),
    type VARCHAR(50),
    date DATE,
    userid INT
);






CREATE SEQUENCE orders_sequence START 1;

CREATE TABLE orders(
	ID INT DEFAULT nextval('orders_sequence') PRIMARY KEY,
	customerID int,
	productID int,
	date DATE
);




--TRIGGER bir ilan silindiğinde başvuruların tutulduğu tablodan ilgili ilan başvuruların hepsini siler.

CREATE OR REPLACE FUNCTION delete_application_after_ad_delete()
RETURNS TRIGGER AS $$
BEGIN
    DELETE FROM Application
    WHERE adID = OLD.ID;
    RETURN OLD;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_delete_application
AFTER DELETE ON AD
FOR EACH ROW
EXECUTE FUNCTION delete_application_after_ad_delete();


--alttaki fonksiyon profile dosyasında DisplayProfile içinde
CREATE OR REPLACE FUNCTION get_user_by_name(p_name VARCHAR)
RETURNS TABLE (
    ID INT,
    name VARCHAR(255),
    surname VARCHAR(255),
    password VARCHAR(255),
    address VARCHAR(255),
    telNo VARCHAR(15),
    username VARCHAR(50)
) AS $$
BEGIN
    RETURN QUERY SELECT * FROM users WHERE users.username = p_name;
END;
$$ LANGUAGE plpgsql;






--view tablosu


CREATE OR REPLACE VIEW user_info_view AS
SELECT
    userName,
    telNo,
    address
FROM
    users;



--EXCEPT komutunu adminproducts dosyasında displayOutOfStock() fonksiyonun içerisindeki SelectQuery stringinde kullandım

--COUNT komutunu profile dosyasında displayCount() fonksiyonunun içerisindeki SelectQuery stringinde kullandım
 
--alttaki fonksiyon adminProductsta display Procust fonksiyonunda kullanıldı
CREATE OR REPLACE FUNCTION get_all_products()
RETURNS TABLE (
    ID INT,
    count INT,
    name VARCHAR(255),
    price INT
) AS $$
DECLARE
    product_info Products%ROWTYPE;
    product_cursor CURSOR FOR SELECT * FROM Products;
BEGIN
    OPEN product_cursor;
    LOOP
        FETCH product_cursor INTO product_info;
        EXIT WHEN NOT FOUND;

        ID := product_info.ID;
        count := product_info.count; 
        name := product_info.name;
        price := product_info.price;

        RETURN NEXT;
    END LOOP;

    CLOSE product_cursor;


END;
$$ LANGUAGE plpgsql;


--2. trigger fonksiyonu
CREATE OR REPLACE FUNCTION check_price_threshold()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.price > 1000 THEN
        -- Burada yapılacak işlemleri ekleyebilirsiniz.
        RAISE EXCEPTION 'Uyarı: Fiyat 1000 üzerine çıktı!';
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_check_price
BEFORE INSERT OR UPDATE ON products
FOR EACH ROW
EXECUTE FUNCTION check_price_threshold();

--foreign key kodları
ALTER TABLE APPLICATION
ADD FOREIGN KEY (applicantID) REFERENCES users (ID) ON DELETE CASCADE;

ALTER TABLE APPLICATION
ADD FOREIGN KEY (referencedID) REFERENCES users (ID) ON DELETE CASCADE;

ALTER TABLE ad
ADD FOREIGN KEY (userid) REFERENCES users (ID) ON DELETE CASCADE;



--INSERT KOMUTLARI
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Fatih', 'Akkuş', 'kütüphane123', 'İzmir', '+905553331111', 'coolwhp');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Ayşenaz', 'Konan', 'fakülte123', 'Denizli', '+905553332222', 'konannaz');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Müdafer', 'Kaymak', 'yemekhane123', 'İstanbul', '+905553333333', 'kaymakmudafer');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Abdullah', 'Belikırık', 'ortabahçe123', 'İstanbul', '+905553334444', 'belikirik123');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Melih Tuna', 'İpek', 'bilgisayar123', 'Kırıkkale', '+905553335555', 'melih_tuna78');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Zehra Bengü', 'Emül', 'elektrik123', 'İzmir', '+905553336666', 'zehra.emül');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Büşra', 'Güral', 'biyomedikal123', 'Ankara', '+905553337777', 'buşragüral97');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Mert Tuna', 'Kurnaz', 'metalurji123', 'Ankara', '+905553338888', 'flutter');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Emir', 'Oğuz', 'mikro123', 'Antalya', '+905553339999', 'heckon');
INSERT INTO users (name, surname, password, address, telNo, userName)
VALUES ('Ömer', 'Aşkın', 'blockchain123', 'İstanbul', '+905553330000', 'aşkın_ömer');

INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('İzmir', '3 kardeşten tekir olan sakin uysal bir kedidir. Diğer kedilerle pek anlaşamaz. Kendisine yeni bir ev arıyor.', 1, 'erkek', 'kedi', '2024-01-10', 1);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('İzmir', 'Sarmanlardan dişi olanı olan çok hareketli zıpır bir minik. Kendisine yeni bir ev arıyor.', 1, 'erkek', 'kedi', '2024-01-10', 1);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('İzmir', 'Sarmanlardan erkek olanı. Çok tatlı bir bebek. Kendisine yeni bir ev arıyor.', 1, 'dişi', 'kedi', '2024-01-10', 1);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('Ankara', 'Aşı kartı mevcut, tüm aşıları tamamlanmış Pofimizi sahiplendirmek istiyoruz. Son derece uysal, tuvalet alışkanlığı tam, kırıp dökmesi olmayan bir tekir kedi.', 5, 'dişi', 'kedi', '2024-01-02', 7);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('Ankara', '2 yaşında bir gozu alinmis asilari tam, oyle sevecen uysal oyuncu bir cocuk onu hic terketmeyecek sevecek ailesi olmak ister misiniz?', 2, 'dişi', 'kedi', '2024-01-03', 7);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('İstanbul', 'İlk aşıları yapıldı. Tuvalet eğitimi almaya başladı. Sahiplenen kişi yavru köpek baktiğinin bilinciyle hareket etmesini istiyorum.', 1, 'dişi', 'köpek', '2023-12-25', 3);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('Antalya', 'Aşıları tam çok sevecen bir dostumuz. Sokakta bulundu tedavisi yapıldı.', 2, 'dişi', 'köpek', '2024-01-10', 9);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('Kırıkkale', '65 cm Seba marka salma kafes, akıllı yemlik ve Vege marka yuvalığı ile birlikte sadece şehir içinde teslim edilecek.', 2, 'dişi', 'muhabbet kuşu', '2024-01-10', 5);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('Denizli', 'Yavrumuz sokaktan kurtarılmıştır. Veteriner kontrolleri yapıldı. Mikro chip takıldı. İç ve dış parazit uygulamalar yapıldı. Aşılarına başlandı. ', 2, 'erkek', 'köpek', '2024-01-10', 2);
INSERT INTO ad (address, description, age, sex, type, date, userid)
VALUES ('İzmir', 'mama aşı yol parası hiç bir ücret talep edilmeyecektir iyi aile olsun bakılsın yeter', 5, 'dişi', 'köpek', '2024-01-10', 6);
INSERT INTO Products (count, name, price)
VALUES (100, 'Kuru Kedi Maması', 50);
INSERT INTO Products (count, name, price)
VALUES (90, 'Kuru Köpek Maması', 40);
INSERT INTO Products (count, name, price)
VALUES (20, 'Yaş Kedi Maması', 100);
INSERT INTO Products (count, name, price)
VALUES (30, 'Yaş Köpek Maması', 80);
INSERT INTO Products (count, name, price)
VALUES (10, 'Kuş Kafesi', 200);
INSERT INTO Products (count, name, price)
VALUES (50, 'Kedi Kumu', 90);
INSERT INTO Products (count, name, price)
VALUES (20, 'Kedi Tasması', 60);
INSERT INTO Products (count, name, price)
VALUES (20, 'Köpek Tasması', 70);
INSERT INTO Products (count, name, price)
VALUES (75, 'Kuş Yemi', 30);
INSERT INTO Products (count, name, price)
VALUES (30, 'Köpek Tasması', 70);

