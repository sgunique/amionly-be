CREATE SCHEMA IF NOT EXISTS amionly;

CREATE TABLE IF NOT EXISTS amionly.surveys (
    survey_id integer NOT NULL,
    response_id integer,
    is_editable boolean NOT NULL,
    start_date timestamp(6) with time zone,
    end_date timestamp(6) with time zone,
    access_public boolean,
    CONSTRAINT surveys_pkey PRIMARY KEY (survey_id)
);


CREATE TABLE  IF NOT EXISTS amionly.questiontype (
    question_type varchar(80),
    question_type_name varchar(80),
    CONSTRAINT questiontype_pkey PRIMARY KEY (question_type)
);

CREATE TABLE IF NOT EXISTS amionly.category (
    category varchar(80),
    question_id varchar(80),
    CONSTRAINT category_pkey PRIMARY KEY (category)
);


-- CREATE INDEX "FK" ON  "amionly.category" ("question_id");

CREATE TABLE IF NOT EXISTS amionly.question (
    question_id integer NOT NULL,
    question_text varchar(160),
    survey_id integer NOT NULL,
    question_type varchar(80),
    question_number integer,
    chart_type varchar(80),
    category varchar(80),
    CONSTRAINT question_pkey PRIMARY KEY (question_id)
);

-- CREATE INDEX "FK" ON  "amionly.question" ("survey_id", "question_type", "category");

CREATE TABLE IF NOT EXISTS amionly.choice (
    choice_id integer NOT NULL,
    choice_text varchar(320),
    choice_value varchar(160),
    question_id integer NOT NULL,
    CONSTRAINT choice_pkey PRIMARY KEY (choice_id)
);

-- CREATE INDEX "FK" ON  "amionly.choice" ("question_id");

CREATE TABLE IF NOT EXISTS amionly.single_choice_question (
    question_id integer NOT NULL,
    choice_id integer,
    response_id integer,
    CONSTRAINT single_choice_question_pkey PRIMARY KEY (question_id)
);


-- CREATE INDEX "FK" ON  "amionly.single_choice_question" ("question_id", "choice_id", "response_id");


CREATE TABLE IF NOT EXISTS amionly.response (
    response_id integer NOT NULL,
    question_id integer NOT NULL,
    survey_id integer NOT NULL,
    user_id integer NOT NULL,
    choice_id integer NOT NULL,
    response_date timestamp(6) with time zone,
    CONSTRAINT response_pkey PRIMARY KEY (response_id)
);

-- CREATE INDEX "FK" ON  "amionly.response" ("question_id", "survey_id", "user_id", "choice_id");

CREATE TABLE IF NOT EXISTS amionly.multiple_choice (
    choice_id integer,
    question_id integer,
    response_id integer
);

-- CREATE INDEX "FK" ON  "amionly.multiple_choice" ("question_id", "choice_id");

-- CREATE INDEX "Fk" ON  "amionly.multiple_choice" ("response_id");

CREATE TABLE IF NOT EXISTS amionly.yesno_choice_question (
    choice_id integer,
    choice_value integer,
    response_id integer
);

-- CREATE INDEX "FK" ON  "amionly.yesno_choice_question" ("question_id", "response_id");
