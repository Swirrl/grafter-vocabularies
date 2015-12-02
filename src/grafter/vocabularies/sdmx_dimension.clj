(ns grafter.vocabularies.sdmx-dimension
  "Some convenience terms for the SDMX dimension vocabulary."
  (:require [grafter.vocabularies.core :refer :all]))

(def sdmx-dimension (prefixer "http://purl.org/linked-data/sdmx/2009/dimension#"))

(def sdmx-dimension:refArea (sdmx-dimension "refArea"))
(def sdmx-dimension:refPeriod (sdmx-dimension "refPeriod"))
