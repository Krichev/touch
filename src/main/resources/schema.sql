create table Spittle (
	id identity,
	answerClient varchar(140) not null,
	responseAgent varchar(140) not null,

	created_at timestamp not null,
	latitude double,
	longitude double
);

