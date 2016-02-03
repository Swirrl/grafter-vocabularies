(ns grafter.vocabularies.owl-time
  "Some convenience terms for the time ontology."
  (:require [grafter.vocabularies.core :refer :all]))

(def owl-time (prefixer "http://www.w3.org/2006/time#"))
(def owl-time:hasBeginning (owl-time "hasBeginning"))
(def owl-time:hasEnd (owl-time "hasEnd"))
(def owl-time:inXSDDateTime (owl-time "inXSDDateTime"))
(def owl-time:Interval (owl-time "Interval"))
(def owl-time:Instant (owl-time "Instant"))
