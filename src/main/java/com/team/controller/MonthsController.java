package com.team.controller;

import com.team.model.*;
import com.team.view.Screen;
import java.util.List;

public class MonthsController {

    public void start() {
        List<Month> months = List.of(
                new January(), new February(), new March(),
                new April(), new May(), new June(),
                new July(), new August(), new September(),
                new October(), new November(), new December()
        );
        new Screen().showMonths(months);
    }
}