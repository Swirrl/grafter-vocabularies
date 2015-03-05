(ns grafter.vocabularies.rdf-test
  (:require [clojure.test :refer :all]
            [grafter.vocabularies.rdf :refer :all]))

(deftest rdf-type-test
  (testing "rdf:a"
    (is (= rdf:a
           "http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))))
