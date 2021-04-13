CREATE TABLE movies(
  id_movie NUMBER(4) NOT NULL,
  title VARCHAR2(10),
  release_date DATE,
  duration NUMBER(5),
  score NUMBER(5)
  )
/
CREATE TABLE genres(
  id_gen NUMBER(4) NOT NULL,
  name VARCHAR2(10)
  )
/

CREATE TABLE associative(
  id_movie CHAR(4),
  id_gen CHAR(4)
  )
/

INSERT INTO movies VALUES   ('111', 'Movie1', TO_DATE('17/02/1995', 'dd/mm/yyyy'),130,142);
INSERT INTO movies VALUES   ('112', 'Movie2', TO_DATE('25/06/1999', 'dd/mm/yyyy'),170,105);
INSERT INTO movies VALUES   ('113', 'Movie3', TO_DATE('15/04/2004', 'dd/mm/yyyy'),140,132);
INSERT INTO movies VALUES   ('114', 'Movie4', TO_DATE('10/12/2010', 'dd/mm/yyyy'),120,1233);
INSERT INTO movies VALUES   ('115', 'Movie5', TO_DATE('13/07/2018', 'dd/mm/yyyy'),100,12);


INSERT INTO genres VALUES ('21', 'Action');
INSERT INTO genres VALUES ('22', 'Drama');

INSERT INTO associative VALUES ('111','21');
INSERT INTO associative VALUES ('112','22');
INSERT INTO associative VALUES ('113','22');
INSERT INTO associative VALUES ('114','21');
INSERT INTO associative VALUES ('115','22');

COMMIT;
