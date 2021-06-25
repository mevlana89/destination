--
-- Création de la base de données
--
CREATE DATABASE destination;

--
-- Création des users
-- Même noms que les profils dans github
--

CREATE USER 'destinationusr'@'localhost' IDENTIFIED WITH caching_sha2_password BY 'destinationpwd';

--
-- Attribution des droits
--

GRANT ALL ON destination.* TO  'destinationusr'@'localhost';

--
-- Remonté des droits
--

FLUSH PRIVILEGES
