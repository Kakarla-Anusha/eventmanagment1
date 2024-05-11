create table if not exists sponsor (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    industry TEXT  
);
create table if not exists event (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    date TEXT  
);

create table if not exists event_sponsor (
    eventId int,
    sponsorId int,
    PRIMARY KEY (eventId,sponsorId),
    Foreign key (eventId) references event (id),
    foreign key (sponsorId) references sponsor (id)
);
