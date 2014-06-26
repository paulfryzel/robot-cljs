(ns robot.core)

(defn main [])
(set! *main-cli-fn* main)

(deftype Robot []
  Object
  (speak [_]
    (str "beep boop")))

(set! js/module.exports robot.core.Robot)
