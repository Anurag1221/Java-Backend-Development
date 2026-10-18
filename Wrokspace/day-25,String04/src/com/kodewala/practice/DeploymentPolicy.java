
package com.kodewala.practice;

class DeploymentPolicy {

    public final void validateDeployment() {
        System.out.println("Deployment validation passed");
    }

    public void validateDeployment1() {
        System.out.println("Deployment started");
    }
}

class ProductionDeploymentPolicy extends DeploymentPolicy {

    // Cannot override a final method
    // public void validateDeployment() {
    //     System.out.println("Production validation");
    // }

    @Override
    public void validateDeployment1() {
        System.out.println("Production deployment started");
    }
}

