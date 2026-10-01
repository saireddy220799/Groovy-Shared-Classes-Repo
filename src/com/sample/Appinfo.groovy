package com.sample

class Appinfo{
    def steps
    String name
    int port
    String environment

    Appinfo(steps,String name,int port,String environment){
        this.steps=steps
        this.name=name
        this.port=port
        this.environment=environment
    }

    void printInfo(){
        steps.echo "Application Name:${name}"
        steps.echo "Port:${port}"
        steps.echo "Environment Type:${environment}"
    }
}