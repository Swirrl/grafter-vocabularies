(ns grafter.vocabularies.os
  "Some convenience terms for the ordnancesurvey postcodes
  vocabulary."
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def os (prefixer "http://data.ordnancesurvey.co.uk/ontology/postcode/"))
(def os:postcode (os "postcode"))
