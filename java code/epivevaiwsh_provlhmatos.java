package org.Smartcity;

import java.time.LocalDateTime;

public class epivevaiwsh_provlhmatos {
    private boolean epivevaiwsh_provlhmatos; //down_epivevaiwsh_provlhmatos->false up_epivevaiwsh_provlhmatos->true
    private LocalDateTime date_time;

    public epivevaiwsh_provlhmatos(boolean epivevaiwsh_provlhmatos) {
        this.epivevaiwsh_provlhmatos = epivevaiwsh_provlhmatos;
        date_time = LocalDateTime.now();
    }

    public boolean getepivevaiwsh_provlhmatos() {
        return epivevaiwsh_provlhmatos;
    }

    public void printepivevaiwsh_provlhmatos(){

    }
}