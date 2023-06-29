/*function updateTime() {
    var now = new Date();
    var datetimeElement = document.getElementById('datetime');
    datetimeElement.textContent = now.toLocaleString('es-ES', { hour12: false });
}*/


function updateTime() {
    var now = new Date();
    var datetimeElement = document.getElementById('datetime');
    var options = { hour12: false, hour: '2-digit', minute: '2-digit', second: '2-digit' };
    var timeString = now.toLocaleTimeString('es-ES', options);
    var dateString = now.toLocaleDateString('es-ES');
    datetimeElement.textContent = timeString + ' - ' + dateString;
}




function openAlarmPopup() {
    var hour = prompt("Ingrese la hora (0-23):");
    var minute = prompt("Ingrese los minutos (0-59):");

    hour = parseInt(hour, 10);
    minute = parseInt(minute, 10);

    if (!isNaN(hour) && !isNaN(minute)) {
        setAlarm(hour, minute);
    } else {
        alert("Por favor, ingrese una hora y minutos válidos.");
    }
}

function setAlarm(hour, minute) {
    var now = new Date();
    var alarmTime = new Date(now.getFullYear(), now.getMonth(), now.getDate(), hour, minute);

    var timeRemaining = alarmTime - now;

    if (timeRemaining > 0) {
        setTimeout(function() {
            // Código a ejecutar cuando llegue la hora de la alarma
            console.log("¡Alarma! Hora: " + hour + ":" + minute);
            // Aquí puedes agregar el código para mostrar una notificación, reproducir un sonido, etc.
        }, timeRemaining);
    } else {
        console.log("La hora de la alarma ya ha pasado.");
    }
}

var datetimeElement = document.getElementById('datetime');
datetimeElement.addEventListener('click', openAlarmPopup);

updateTime();
setInterval(updateTime, 1000);