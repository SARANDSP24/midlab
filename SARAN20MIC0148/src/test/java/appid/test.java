package appid;

import org.testing.Assert;


public class test {
    @Test
    public void logtest1() {
        app obj = new app();
        Assert.assertEquals(0, obj.log("Ramcharan", 13));
    }

    @Test
    public void logtest2() {
        app obj = new app();
        Assert.assertEquals(1, obj.log("ram", 3025));
    }
}