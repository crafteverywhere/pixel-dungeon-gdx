package net.whitegem.pixeldungeon;

/**
 * Created by Carl-Station on 01/18/15.
 */
public enum Language
{
    ENGLISH("en"),
    S_CHINESE("chs"),
    T_CHINESE("cht");

    private final String SHORT_FORM;

    private Language(String shortForm)
    {
        SHORT_FORM = shortForm;
    }

    @Override
    public String toString()
    {
        return SHORT_FORM;
    }
}
