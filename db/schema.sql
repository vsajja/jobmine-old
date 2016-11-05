CREATE TABLE company
(
    company_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    description VARCHAR,
    website_url VARCHAR,
    total_employees INTEGER,
    industry VARCHAR,
    founded_date DATE,
    location_id INTEGER,
    image_id INTEGER,
    CONSTRAINT company_location_location_id_fk FOREIGN KEY (location_id) REFERENCES location (location_id),
    CONSTRAINT company_image_image_id_fk FOREIGN KEY (image_id) REFERENCES image (image_id)
);
CREATE TABLE document
(
    document_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    data BYTEA,
    job_app_package_id INTEGER,
    CONSTRAINT document_job_app_package_job_app_package_id_fk FOREIGN KEY (job_app_package_id) REFERENCES job_app_package (job_app_package_id)
);
CREATE TABLE image
(
    image_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    src VARCHAR,
    url VARCHAR,
    data BYTEA
);
CREATE TABLE job
(
    job_id INTEGER PRIMARY KEY NOT NULL,
    title VARCHAR,
    "description	" VARCHAR,
    created_timestamp TIMESTAMP,
    type VARCHAR,
    status VARCHAR,
    total_openings INTEGER,
    job_mine_id INTEGER,
    company_id INTEGER,
    location_id INTEGER,
    CONSTRAINT job_job_mine_job_mine_id_fk FOREIGN KEY (job_mine_id) REFERENCES job_mine (job_mine_id),
    CONSTRAINT job_company_company_id_fk FOREIGN KEY (company_id) REFERENCES company (company_id),
    CONSTRAINT job_location_location_id_fk FOREIGN KEY (location_id) REFERENCES location (location_id)
);
CREATE TABLE job_app
(
    job_app_id INTEGER PRIMARY KEY NOT NULL,
    job_id INTEGER,
    job_app_package_id INTEGER,
    CONSTRAINT job_app_job_job_id_fk FOREIGN KEY (job_id) REFERENCES job (job_id),
    CONSTRAINT job_app_job_app_package_job_app_package_id_fk FOREIGN KEY (job_app_package_id) REFERENCES job_app_package (job_app_package_id)
);
CREATE TABLE job_app_package
(
    job_app_package_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    student_id INTEGER,
    CONSTRAINT job_app_package_student_student_id_fk FOREIGN KEY (student_id) REFERENCES student (student_id)
);
CREATE TABLE job_interview
(
    job_interview_id INTEGER PRIMARY KEY NOT NULL,
    status VARCHAR,
    created_timestamp TIMESTAMP,
    job_id INTEGER,
    student_id INTEGER,
    CONSTRAINT job_interview_job_job_id_fk FOREIGN KEY (job_id) REFERENCES job (job_id),
    CONSTRAINT job_interview_student_student_id_fk FOREIGN KEY (student_id) REFERENCES student (student_id)
);
CREATE TABLE job_mine
(
    job_mine_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    school_id INTEGER,
    CONSTRAINT job_mine_school_school_id_fk FOREIGN KEY (school_id) REFERENCES school (school_id)
);
CREATE TABLE job_offer
(
    job_offer_id INTEGER PRIMARY KEY NOT NULL,
    expiry_timestamp TIMESTAMP,
    salary VARCHAR,
    job_id INTEGER,
    student_id INTEGER,
    CONSTRAINT job_offer_job_job_id_fk FOREIGN KEY (job_id) REFERENCES job (job_id),
    CONSTRAINT job_offer_student_student_id_fk FOREIGN KEY (student_id) REFERENCES student (student_id)
);
CREATE TABLE location
(
    location_id INTEGER PRIMARY KEY NOT NULL,
    city VARCHAR,
    state_or_province VARCHAR,
    zip_or_postalcode VARCHAR,
    country VARCHAR
);
CREATE TABLE school
(
    school_id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR,
    type VARCHAR,
    total_students INTEGER,
    established_date DATE,
    description VARCHAR,
    location_id INTEGER,
    image_id INTEGER,
    CONSTRAINT school_location_location_id_fk FOREIGN KEY (location_id) REFERENCES location (location_id),
    CONSTRAINT school_image_image_id_fk FOREIGN KEY (image_id) REFERENCES image (image_id)
);
CREATE TABLE student
(
    student_id INTEGER PRIMARY KEY NOT NULL,
    first_name VARCHAR,
    last_name VARCHAR,
    username VARCHAR,
    email_address VARCHAR,
    last_loggedin_timestamp TIMESTAMP,
    employment_status VARCHAR,
    joined_timestamp TIMESTAMP,
    karma INTEGER,
    total_views INTEGER,
    age INTEGER,
    gender VARCHAR,
    salary VARCHAR,
    relationship_status VARCHAR,
    dreams VARCHAR,
    phone_number VARCHAR,
    employment_history VARCHAR,
    skills VARCHAR,
    school_id INTEGER,
    location_id INTEGER,
    image_id INTEGER,
    CONSTRAINT student_school_school_id_fk FOREIGN KEY (school_id) REFERENCES school (school_id),
    CONSTRAINT student_location_location_id_fk FOREIGN KEY (location_id) REFERENCES location (location_id),
    CONSTRAINT student_image_image_id_fk FOREIGN KEY (image_id) REFERENCES image (image_id)
);