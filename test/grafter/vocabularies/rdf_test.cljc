(ns grafter.vocabularies.rdf-test
  (:require [clojure.test :refer [deftest testing is]]
            [grafter.vocabularies.core :refer [->uri]]
            [grafter.vocabularies.rdf :refer [rdf:a]]))

(deftest rdf-type-test
  (testing "rdf:a"
    (is (= rdf:a
           (->uri "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")))))
