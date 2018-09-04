(ns grafter.vocabularies.sdmx-measure
  "Some convenience terms for the SDMX measure vocabulary."
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def sdmx-measure (prefixer "http://purl.org/linked-data/sdmx/2009/measure#"))

(def sdmx-measure:obsValue (sdmx-measure "obsValue"))
