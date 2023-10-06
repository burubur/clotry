(ns clotry.core-test
  (:require [clojure.test :refer :all]
            [clotry.core :refer :all]
            [clotry.core :as clotry]
            ))

(deftest main-test
  (testing "call main func"
    (is (= (clotry/foo "a") nil))))


(def set-1 #{
             "vehicle-type/car"
             "registered-service-area-id/1"
             })

(def set-2 #{
             "country/id"
             "registered-service-area-id/1"
             "vehicle-type/car"
             })
(deftest aha
  (testing "uhu"
    (is (= (clojure.set/subset? set-1 set-2) true))))
