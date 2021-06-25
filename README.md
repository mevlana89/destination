# destination - Etape pour test du projet 

1 . Il faut créé la base de donnée avec via le fichier qui se trouve sous resources/createDatabase.sql

2. il faut lancer le programme (c'est hibenate qui créé les tables ect...)

2' : le user et celui par défaut créé par Spring

3. il faut ajouter le jeu de donné ci dessous pour test :



INSERT INTO `destination`.`destination` (`date_debut`, `date_fin`, `pays`) VALUES ('2021-06-30', '2021-07-07', 'France');
INSERT INTO `destination`.`destination` (`date_debut`, `date_fin`, `pays`) VALUES ('2021-06-30', '2021-07-30', 'Allemagne');
INSERT INTO `destination`.`destination` (`date_debut`, `date_fin`, `pays`) VALUES ('2021-08-30', '2021-09-30', 'Inde');
INSERT INTO `destination`.`destination` (`date_debut`, `date_fin`, `pays`) VALUES ('2021-08-30', '2021-09-30', 'Belgique');

INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('01/02/2021', 'Superbe ville !', 'Paris', '1');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('02/03/2021', 'La ville est sublime', 'Lyon', '1');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('05/12/2021', 'Ville au nord de la France', 'Lille', '1');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('12/02/2021', 'resumé de l Allemagne', 'Berlin', '2');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('12/02/2021', 'ne pas oublé le port d Hambourg', 'Hambourg', '2');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('12/02/2021', 'resumé Delhi', 'Delhi', '3');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('12/02/2021', 'magnifique', 'Bruxelle', '4');
INSERT INTO `destination`.`etape` (`date_debut_etape`, `resume_etape`, `ville`, `destination_id`) VALUES ('12/02/2021', 'résumé de Liège', 'Liège', '4');


INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '1');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('paris.fr', '1');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('resto.fr', '1');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('google.de', '2');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('google.de', '2');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '3');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '4');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '5');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '6');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '7');
INSERT INTO `destination`.`lien` (`lien`, `etape_id`) VALUES ('lien.fr', '8');
