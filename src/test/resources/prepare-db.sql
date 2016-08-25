use election;

set FOREIGN_KEY_CHECKS = 0;
truncate table voters;
truncate table states;
truncate table candidates;
truncate table candidates_voters;
set FOREIGN_KEY_CHECKS = 1;
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('1', '0', 'Sally', 'F', '35');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('2', '0', 'Mally', 'F', '45');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('3', '0', 'Dally', 'F', '65');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('4', '0', 'Rally', 'F', '75');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('5', '0', 'Tally', 'F', '35');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('6', '0', 'Pally', 'F', '35');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('7', '0', 'Bob', 'M', '25');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('8', '0', 'Rob', 'M', '35');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('9', '0', 'Nob', 'M', '34');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('10', '0', 'Gob', 'M', '55');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('11', '0', 'Wob', 'M', '65');
INSERT INTO `election`.`voters` (`id`, `version`, `name`, `gender`, `age`) VALUES ('12', '0', 'Pob', 'M', '75');




INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('1', '0', '30', 'IL');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('2', '0', '30', 'MD');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('3', '0', '30', 'AL');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('4', '0', '30', 'FL');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('5', '0', '30', 'NY');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('6', '0', '30', 'NJ');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('7', '0', '30', 'CT');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('8', '0', '30', 'HA');
INSERT INTO `election`.`states` (`id`, `version`, `electoral_votes`, `state`) VALUES ('9', '0', '30', 'MA');


INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('1', '0', 'HILLARY', 'DEMOCRAT', 'SENATOR', '3');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('2', '0', 'TRUMP', 'DEMOCRAT', 'SENATOR', '4');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('3', '0', 'PETER', 'DEMOCRAT', 'SENATOR', '5');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('4', '0', 'MIKE', 'DEMOCRAT', 'GOVERNOR', '6');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('5', '0', 'GEORGE', 'DEMOCRAT', 'SENATOR', '6');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('6', '0', 'ROBBY', 'DEMOCRAT', 'SENATOR', '8');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('7', '0', 'TOM', 'DEMOCRAT', 'SENATOR', '8');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('8', '0', 'ROCKY', 'DEMOCRAT', 'GOVERNOR', '8');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('9', '0', 'JENNY', 'DEMOCRAT', 'GOVERNOR', '7');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('10', '0', 'TOM1', 'DEMOCRAT', 'SENATOR', '7');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('11', '0', 'TOM2', 'DEMOCRAT', 'PRESIDENT', '7');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('12', '0', 'TOM3', 'DEMOCRAT', 'SENATOR', '8');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('13', '0', 'TOM4', 'DEMOCRAT', 'SENATOR', '8');
# INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('14', '0', 'TOM5', 'DEMOCRAT', 'PRESIDENT', '8');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('15', '0', 'TOM6', 'DEMOCRAT', 'SENATOR', '2');
INSERT INTO `election`.`candidates` (`id`, `version`, `name`, `party`, `position`, `state_id`) VALUES ('16', '0', 'TOM7', 'DEMOCRAT', 'SENATOR', '2');




INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('1', '1');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('2', '1');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('6', '2');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('7', '3');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '2');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '3');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '4');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '5');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '6');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '7');
INSERT INTO `election`.`candidates_voters` (`candidate_id`, `voter_id`) VALUES ('8', '8');

