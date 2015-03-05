(ns grafter.vocabularies.org
  (:require [grafter.vocabularies.core :refer :all]))

(def org (prefixer "http://www.w3.org/ns/org#"))

(def org:Organization (org "Organization"))
