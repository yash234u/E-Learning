package com.example.lms.extra;

public class ModelAssignment {


        String submissionDate, title, tutor, timestamp;

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ModelAssignment(String submissionDate, String title, String tutor, String timestamp) {
        this.submissionDate = submissionDate;
        this.title = title;
        this.tutor = tutor;
        this.timestamp = timestamp;
    }
}



