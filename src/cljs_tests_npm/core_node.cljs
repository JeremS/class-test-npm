(ns cljs-tests-npm.core-node
  (:require
    [cljs.nodejs :as nodejs]
    ["@material/textfield/foundation" :as textf]))


(nodejs/enable-util-print!)


(def foundation textf/MDCCheckboxFoundation)


(def foundation-instance (new foundation (.defaultAdapter foundation)))

(defn -main [& args]
  (println foundation-instance))


(set! *main-cli-fn* -main)
