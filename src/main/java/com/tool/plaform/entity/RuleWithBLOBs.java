package com.tool.plaform.entity;

public class RuleWithBLOBs extends Rule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.cond
     *
     * @mbg.generated
     */
    private String cond;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.cond_content
     *
     * @mbg.generated
     */
    private String condContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.fields
     *
     * @mbg.generated
     */
    private String fields;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.cond
     *
     * @return the value of rule.cond
     *
     * @mbg.generated
     */
    public String getCond() {
        return cond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.cond
     *
     * @param cond the value for rule.cond
     *
     * @mbg.generated
     */
    public void setCond(String cond) {
        this.cond = cond == null ? null : cond.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.cond_content
     *
     * @return the value of rule.cond_content
     *
     * @mbg.generated
     */
    public String getCondContent() {
        return condContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.cond_content
     *
     * @param condContent the value for rule.cond_content
     *
     * @mbg.generated
     */
    public void setCondContent(String condContent) {
        this.condContent = condContent == null ? null : condContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.fields
     *
     * @return the value of rule.fields
     *
     * @mbg.generated
     */
    public String getFields() {
        return fields;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.fields
     *
     * @param fields the value for rule.fields
     *
     * @mbg.generated
     */
    public void setFields(String fields) {
        this.fields = fields == null ? null : fields.trim();
    }
}