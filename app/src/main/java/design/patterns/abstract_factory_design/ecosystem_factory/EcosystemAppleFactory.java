package design.patterns.abstract_factory_design.ecosystem_factory;

import design.patterns.abstract_factory_design.products.earbuds.EarbudsApple;
import design.patterns.abstract_factory_design.products.earbuds.IEarbuds;
import design.patterns.abstract_factory_design.products.smartphone.ISmartphone;
import design.patterns.abstract_factory_design.products.smartphone.SmartphoneApple;
import design.patterns.abstract_factory_design.products.smartwatch.ISmartWatch;
import design.patterns.abstract_factory_design.products.smartwatch.SmartWatchApple;

public class EcosystemAppleFactory implements IEcosystemFactory {

    private static String ecosystemName = "Apple";

    public static String getEcosystemName() {
        return ecosystemName;
    }

    /*
     * Apple ecosytem factory is responsible for creating iPhone, apple Watch, airpods
     */

    @Override
    public ISmartphone createSmartphone() {
        return new SmartphoneApple();
    }

    @Override
    public ISmartWatch createSmartwatch() {
        return new SmartWatchApple();
    }

    @Override
    public IEarbuds createEarbuds() {
        return new EarbudsApple();
    }
    
}
