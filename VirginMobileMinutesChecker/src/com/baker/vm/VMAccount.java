package com.baker.vm;

import com.jaygoel.virginminuteschecker.IVMCScraper;

/**
 * @author baker
 *
 */
public final class VMAccount
{

    public static VMAccount createInvalid(final String iPhoneNumber)
    {
        return new VMAccount(iPhoneNumber);
    }

    public VMAccount(final String html, final IVMCScraper scraper)
    {
        isValid = scraper.isValid(html);
        if (isValid)
        {
            number = scraper.getPhoneNumber(html);
            monthlyCharge = scraper.getMonthlyCharge(html);
            balance = scraper.getCurrentBalance(html);
            minAmountDue = scraper.getMinAmountDue(html);
            dueDate = scraper.getDateDue(html);
            chargedOn = scraper.getChargedOn(html);
            minutesUsed = scraper.getMinutesUsed(html);
        }
        else
        {
            number = null;
            monthlyCharge = null;
            balance = null;
            minAmountDue = null;
            dueDate = null;
            chargedOn = null;
            minutesUsed = null;
        }
    }

    private VMAccount(final String iPhoneNumber)
    {
        isValid = false;
        number = iPhoneNumber;
        monthlyCharge = null;
        balance = null;
        minAmountDue = null;
        dueDate = null;
        chargedOn = null;
        minutesUsed = null;
    }

    private final boolean isValid;
    private final String number;
    private final String monthlyCharge;
    private final String balance;
    private final String minAmountDue;
    private final String dueDate;
    private final String chargedOn;
    private final String minutesUsed;

    public boolean isValid()
    {
        return isValid;
    }

    public String getNumber()
    {
        return number;
    }
    public String getMonthlyCharge()
    {
        return monthlyCharge;
    }
    public String getBalance()
    {
        return balance;
    }
    public String getMinAmountDue()
    {
        return minAmountDue;
    }
    public String getDueDate()
    {
        return dueDate;
    }
    public String getChargedOn()
    {
        return chargedOn;
    }
    public String getMinutesUsed()
    {
        return minutesUsed;
    }

}
