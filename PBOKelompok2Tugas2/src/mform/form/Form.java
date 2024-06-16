/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mform.form;

import java.util.ArrayList;
import java.util.List;
import mform.entity.*;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public abstract class Form {
    private List<String> errorMessages = new ArrayList<String>();

    public abstract boolean validate();

    public abstract boolean save(String namaFile);
    
    public abstract void print();

    public abstract void reset();

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    protected void addErrorMessages(String message) {
        this.errorMessages.add(message);
    }    
}
