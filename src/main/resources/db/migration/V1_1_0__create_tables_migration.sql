
CREATE TABLE surveys
(
    survey_id integer NOT NULL,
    response_id integer,
    is_editable boolean NOT NULL,
    start_date timestamp(6) with time zone,
    end_date timestamp(6) with time zone,
    access_public boolean,
    CONSTRAINT surveys_pkey PRIMARY KEY (survey_id)
)


CREATE TABLE test_surveys
(
    survey_id integer NOT NULL,
    response_id integer,
    is_editable boolean NOT NULL,
    start_date timestamp(6) with time zone,
    end_date timestamp(6) with time zone,
    access_public boolean,
    CONSTRAINT surveys_pkey PRIMARY KEY (survey_id)
)
