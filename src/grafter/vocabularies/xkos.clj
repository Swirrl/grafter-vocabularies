(ns grafter.vocabularies.xkos
  "Terms in the XKOS vocabulary."
  (:require [grafter.vocabularies.core :refer :all]))

(def xkos (prefixer "http://rdf-vocabulary.ddialliance.org/xkos#"))

; Classifications and classification schemes
(def xkos:belongsTo (xkos "belongsTo"))
(def xkos:follows (xkos "follows"))
(def xkos:supercedes (xkos "supercedes"))
(def xkos:variant (xkos "variant"))
(def xkos:covers (xkos "covers"))
(def xkos:coversExhaustively (xkos "coversExhaustively"))
(def xkos:coversMutuallyExclusively (xkos "coversMutuallyExclusively"))
(def xkos:classifiedUnder (xkos "classifiedUnder"))

; Classification levels
(def xkos:ClassificationLevel (xkos "ClassificationLevel"))
(def xkos:depth (xkos "depth"))
(def xkos:levels (xkos "levels"))
(def xkos:numberOfLevels (xkos "numberOfLevels"))
(def xkos:organizedBy (xkos "organizedBy"))

; Semantic Properties
(def xkos:hasPart (xkos "hasPart"))
(def xkos:isPartOf (xkos "isPartOf"))
