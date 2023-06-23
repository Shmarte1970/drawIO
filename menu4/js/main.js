function updateTime() {
    var now = new Date();
    var datetimeElement = document.getElementById('datetime');
    datetimeElement.textContent = now.toLocaleString('es-ES', { hour12: false });
}

updateTime();
setInterval(updateTime, 1000);