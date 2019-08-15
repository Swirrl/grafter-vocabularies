(ns grafter.vocabularies.sdmx-attribute
  "Some convenience terms for the SDMX attribute vocabulary."
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def sdmx-attribute (prefixer "http://purl.org/linked-data/sdmx/2009/attribute#"))

(def sdmx-attribute:statUnit (sdmx-attribute "statUnit"))
(def sdmx-attribute:unitMeasure (sdmx-attribute "unitMeasure"))
