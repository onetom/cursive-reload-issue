(ns cursive.reload-test
  (:require [clojure.test :refer :all]
            [matcher-combinators.matchers :as m]
            [matcher-combinators.test :refer :all])
  (:require [demo.app]))

(deftest example-test
         (is (match? "ab" (demo.app/some-logic "a"))))
