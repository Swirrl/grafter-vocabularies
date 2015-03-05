(ns grafter.vocabularies.dcat
  (:require [grafter.vocabularies.core :refer :all]))

(def dcat (prefixer "http://www.w3.org/ns/dcat#"))

(def dcat:Dataset (dcat "Dataset"))
(def dcat:theme (dcat "theme"))
