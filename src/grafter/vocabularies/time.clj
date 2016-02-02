(ns grafter.vocabularies.time
  "Some convenience terms for the time vocabulary."
  (:require [grafter.vocabularies.core :refer :all]))

(def time (prefixer "http://www.w3.org/2006/time#"))
(def time:hasBeginning (time "hasBeginning"))
(def time:hasEnd (time "hasEnd"))
(def time:inXSDDateTime (time "inXSDDateTime"))
(def time:Interval (time "Interval"))
(def time:Instant (time "Instant"))
