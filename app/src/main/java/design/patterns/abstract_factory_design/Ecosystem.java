package design.patterns.abstract_factory_design;

import design.patterns.abstract_factory_design.ecosystem_factory.EcosystemAppleFactory;
import design.patterns.abstract_factory_design.ecosystem_factory.EcosystemGoogleFactory;
import design.patterns.abstract_factory_design.ecosystem_factory.IEcosystemFactory;
import design.patterns.abstract_factory_design.products.earbuds.IEarbuds;
import design.patterns.abstract_factory_design.products.smartphone.ISmartphone;
import design.patterns.abstract_factory_design.products.smartwatch.ISmartWatch;

public class Ecosystem {

    private ISmartWatch smartWatch;
    private ISmartphone smartphone;
    private IEarbuds earbuds;
    private String name;
    
    public ISmartWatch getSmartWatch() {
        return smartWatch;
    }

    public ISmartphone getSmartphone() {
        return smartphone;
    }

    public IEarbuds getEarbuds() {
        return earbuds;
    }

    /*
     * This class is responsible for creating Ecosystem, ut it does not
     * directly build the ecosystem. It instead delegates the task of 
     * building individual component (smartphone, smartwatch...) to the
     * factory class of respective ecosystem
     */
    public Ecosystem(IEcosystemFactory factory){
        if(factory instanceof EcosystemGoogleFactory)
            name = EcosystemGoogleFactory.getEcosystemName();
        else if(factory instanceof EcosystemAppleFactory)
            name = EcosystemAppleFactory.getEcosystemName();

        smartphone = factory.createSmartphone();
        smartWatch = factory.createSmartwatch();
        earbuds = factory.createEarbuds();
    }

    @Override
    public String toString() {
        return "I am currently in " + name +" ecosystem" ;
    }

}
