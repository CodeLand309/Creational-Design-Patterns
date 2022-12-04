package design.patterns.abstract_factory_design.ecosystem_factory;

import design.patterns.abstract_factory_design.products.earbuds.EarbudsGoogle;
import design.patterns.abstract_factory_design.products.earbuds.IEarbuds;
import design.patterns.abstract_factory_design.products.smartphone.ISmartphone;
import design.patterns.abstract_factory_design.products.smartphone.SmartphoneGoogle;
import design.patterns.abstract_factory_design.products.smartwatch.ISmartWatch;
import design.patterns.abstract_factory_design.products.smartwatch.SmartWatchGoogle;

public class EcosystemGoogleFactory implements IEcosystemFactory{

    private static String ecosystemName = "Google";

    public static String getEcosystemName() {
        return ecosystemName;
    }

    /*
     * Google ecosytem factory is responsible for creating Pixel phone, Pixel Watch, Pixel earbuds.
     */


    @Override
    public ISmartphone createSmartphone() {
        return new SmartphoneGoogle();
    }

    @Override
    public ISmartWatch createSmartwatch() {
        return new SmartWatchGoogle();
    }

    @Override
    public IEarbuds createEarbuds() {
        return new EarbudsGoogle();
    }
    
}
