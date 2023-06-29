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

updateTime();
setInterval(updateTime, 1000);