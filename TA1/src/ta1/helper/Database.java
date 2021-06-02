/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta1.helper;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alna
 */
public class Database {
    
    private static Database instance;
    private Map<String, String> data;
    
    private Database() {
        data = new HashMap<>();
    }
    
    // perform a singleton pattern
    public static Database getInstance() {
        if (instance == null) instance = new Database();
        return instance;
    }
    
    public String getData(final String key) {
        return this.data.getOrDefault(key, "");
    }
    
    public void addData(final String key, final String value) {
        this.data.remove(key);
        this.data.put(key, value);
    }
}
