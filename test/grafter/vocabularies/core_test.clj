(ns grafter.vocabularies.core-test
  (:require [clojure.test :refer :all]
            [grafter.vocabularies.core :refer :all]))

(deftest prefixer-test
  (testing "Prefixer"
    (let [example-prefixer (prefixer "http://example.org/")]
      (is (= (example-prefixer "path")
             "http://example.org/path")))))
