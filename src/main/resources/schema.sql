drop table if exists VEHICLE_ENTITY;
drop table if exists OWNER_ENTITY;

create table OWNER_ENTITY
(
    FIRST_ID      BIGINT not null auto_increment,
    SECOND_ID     BIGINT not null auto_increment,
    NAME    CHARACTER VARYING(255),
    SURNAME CHARACTER VARYING(255),
    PRIMARY KEY (FIRST_ID, SECOND_ID)
);

create table VEHICLE_ENTITY
(
    ID       BIGINT not null primary key auto_increment,
    MODEL    CHARACTER VARYING(255),
    VIN      CHARACTER VARYING(255),
    OWNER_FIRST_ID BIGINT,
    OWNER_SECOND_ID BIGINT,
    constraint FKGL7OVD7OA4SRX12SH954N8TB3
        foreign key (OWNER_FIRST_ID, OWNER_SECOND_ID) references OWNER_ENTITY
);


