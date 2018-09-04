(ns grafter.vocabularies.test-runner
  (:require [cljs.test :as t :include-macros true]
            [doo.runner :refer-macros [doo-tests]]
            [grafter.vocabularies.core-test]
            [grafter.vocabularies.rdf-test]))

(doo-tests 'grafter.vocabularies.core-test
           'grafter.vocabularies.rdf-test)
