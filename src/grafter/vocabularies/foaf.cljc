(ns grafter.vocabularies.foaf
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def foaf (prefixer "http://xmlns.com/foaf/0.1/"))
(def foaf:Person (foaf "Person"))
(def foaf:age (foaf "age"))
(def foaf:depiction (foaf "depiction"))
(def foaf:gender (foaf "gender"))
(def foaf:homepage (foaf "homepage"))
(def foaf:interest (foaf "interest"))
(def foaf:knows (foaf "knows"))
(def foaf:name (foaf "name"))
(def foaf:nick (foaf "nick"))
(def foaf:primaryTopic (foaf "primaryTopic"))
