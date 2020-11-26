package com.mycompany.classes;

public class PublishingHouse extends Book {

    private String publishingName;
    private String publishingYear;
    private String pageCount;
    private String bindingType;

    public PublishingHouse() {
    }

    public PublishingHouse(String publishingName, String publishingYear, String pageCount
            , String bindingType) {
        super();
        this.publishingName = publishingName;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.bindingType = bindingType;
    }

    public String getPublishingName() {
        return publishingName;
    }

    public String setPublishingName(String publishingName) {
        this.publishingName = publishingName;
        return publishingName;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public String setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
        return publishingYear;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "publishingName='" + publishingName + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", pageCount='" + pageCount + '\'' +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
