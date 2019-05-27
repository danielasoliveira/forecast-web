# forecast-web
Projeto de exibição de temperatura de acordo com a cidade escolhida.

O projeto tem como caracteristica, a exibição de temperatura de acordo com a cidade selecionada.

Para criar o projeto, utilizei banco de dados mysql, java 8 (spring-boot 2.0) e o front-end em angular 7 + node.js.

Abaixo, seguem os passos para rodar o projeto:

=========================================================================================================

Criação da base de dados.

CREATE SCHEMA `hbsis`;
    
  USE `hbsis`;
    
  CREATE TABLE `cidade` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `id_global` int(11) not null,
    `nome` varchar(600) NOT NULL,
    `sgl_pais` varchar(10) not null,
    `pais` varchar(300) not NULL,
    `latitude` varchar(300) ,
    `longitude` varchar(300) ,
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;


INSERT INTO `hbsis`.`cidade` (`id_global`,`nome`, `pais`, `sgl_pais`,`latitude`, `longitude`) 
VALUES (3448439, 'SAO PAULO', 'BRAZIL', 'BR', '-23.547501', '-46.636108');

INSERT INTO `hbsis`.`cidade` (`id_global`,`nome`, `pais`, `sgl_pais`,`latitude`, `longitude`) 
VALUES (3452465, 'PRAIA GRANDE', 'BRAZIL', 'BR', '-24.005831', '-46.402779');

INSERT INTO `hbsis`.`cidade` (`id_global`,`nome`, `pais`, `sgl_pais`,`latitude`, `longitude`) 
VALUES (524901, 'MOSCOW', 'RUSSIAN', 'RS', '55.7522', '37.6156');


INSERT INTO `hbsis`.`cidade` (`id_global`,`nome`, `pais`, `sgl_pais`,`latitude`, `longitude`) 
VALUES (1609350, 'BANGKOK', 'THAILAND', 'TH', '13.75', '100.51667');

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'admin#01'

========================================================================================================

Instalação do angular 7 e configuração do projeto

--Instalação do angular
npm install -g @angular/cli

-- Instalação do typescript global
npm install -g typescript

-- Instalação do material
npm install --save @angular/material @angular/cdk @angular/animations hammerjs

-- Instalação do bootstrap, jquery e popper
npm install bootstrap jquery popper.js@1.14.7 -save

Após instalação do angular, abrir o arquivo angular.json e sobrescrever os valores abaixo, tanto no test quando no build.

            "styles": [
              "src/styles.scss",
              "node_modules/jquery/dist/jquery.min.js",
              "node_modules/popper.js/dist/esm/popper.min.js",
              "node_modules/bootstrap/dist/css/bootstrap.css"
            ],
            "scripts": [
              "node_modules/jquery/dist/jquery.slim.min.js",
              "node_modules/popper.js/dist/umd/popper.min.js",  
              "node_modules/bootstrap/dist/js/bootstrap.min.js"
            ]
            
=========================================================================================================


