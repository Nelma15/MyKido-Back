-- Initialisation des tables UserEntity, ChildEducatorEntity, AdminEntity, ChildEntity, Activity, ParentEntity
-- Table UserEntity
INSERT INTO users (id,user_type,password, email,last_name,first_name,phone,level_Access,last_Login,role) VALUES
(1,'CHILDEDUCATOR',  '$2a$12$0ZWtHFDQfXvTGurOAMdzmOO08XYH2W4eZsiSbCx0IedrSWV7UEag.', 'educateur@mykido.fr','Educateur','educateur','0636681000',null, null,'ROLE_CHILDEDUCATOR'),
(2,'ADMIN', '$2a$12$0ZWtHFDQfXvTGurOAMdzmOO08XYH2W4eZsiSbCx0IedrSWV7UEag.', 'admin@mykido.fr','Admin','root',null,'Niveau 1', '2023-10-01 08:00:00','ROLE_ADMIN'),
(3,'PARENT',  '$2a$12$0ZWtHFDQfXvTGurOAMdzmOO08XYH2W4eZsiSbCx0IedrSWV7UEag.', 'manel.merini@mykido.fr',
 'Merini','Manel','+33712567899',null,null,'ROLE_PARENT');

-- Table ChildEntity
INSERT INTO children (id, children.last_name, first_name, birth_date, allergies, notes, parent_id) VALUES
(1, 'Benali', 'Wacim', '2018-05-12', 'Aucune', 'Aime les activités artistiques', 3),
(2, 'Benali', 'Yara', '2017-08-23', 'Pollen', 'Aime les histoires', 3);

-- Table Activity
INSERT INTO activity (id, activity_Time_Start, activity_Time_End, activity_Name, activity_Description, activity_Type, photo, child_id, child_Educator_id) VALUES
(1, '2023-10-01 09:00:00', '2023-10-01 10:00:00', 'Peinture', 'Activité de peinture', 'Activité', NULL, 1, 1),
(2, '2023-10-01 10:00:00', '2023-10-01 11:00:00', 'Lecture', 'Lecture de contes', 'Activité', NULL, 2, 1);