package design.patterns.abstract_factory_design.ecosystem_factory;

import design.patterns.abstract_factory_design.products.earbuds.IEarbuds;
import design.patterns.abstract_factory_design.products.smartphone.ISmartphone;
import design.patterns.abstract_factory_design.products.smartwatch.ISmartWatch;

public interface IEcosystemFactory {
    
    //Factory classes are responsible for creating the individual components of the ecosystem.
    ISmartphone createSmartphone();
    ISmartWatch createSmartwatch();
    IEarbuds createEarbuds();

}
