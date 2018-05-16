package com.intelygenz.jacocosample.test

import cucumber.api.CucumberOptions

@CucumberOptions(
    features = ["features"]
    , glue = ["com.intelygenz.jacocosample.features", "com.intelygenz.jacocosample.support"]
    , format = ["pretty", "html:/data/data/com.intelygenz.jacocosample/cucumber-reports/cucumber-html-report"
        , "json:/data/data/com.intelygenz.jacocosample/cucumber-reports/cucumber.json"
        , "junit:/data/data/com.intelygenz.jacocosample/cucumber-reports/cucumber.xml"]
    , tags = ["~@ignore", "@android"]
)
internal class CucumberTestCase