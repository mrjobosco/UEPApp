package com.uepapp;

import java.util.Date;

/**
 * Created by ehaadmin on 10/23/17.
 */

public interface CompactCalendarViewListener {
    public void onDayClick(Date dateClicked);
    public void onMonthScroll(Date firstDayOfNewMonth);

}
