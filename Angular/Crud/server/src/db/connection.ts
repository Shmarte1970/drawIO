import {Sequelize} from 'sequelize';

const sequelize = new Sequelize('prUsuarios', 'root', 'root2023', {
    host: 'testbbdd.c00tjquuyvht.eu-north-1.rds.amazonaws.com',
    dialect: 'mysql'
  });

  export default sequelize;