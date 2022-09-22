import { Directive, ElementRef, HostBinding, HostListener, Input, OnInit, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appBetterHighlightDirective]'
})
export class BetterHighlightDirectiveDirective implements OnInit {
@Input() defaultColor:string='transparent';
@Input() highlightColor:string='red';
  @HostBinding('style.backgroundColor') backgroundColor:string=this.defaultColor;
  constructor(private elRef:ElementRef,private renderer:Renderer2) { }
  ngOnInit(): void {
    //this.renderer.setStyle(this.elRef.nativeElement,'background-color','blue')
  }
  @HostListener('mouseenter')mouseover(eventData:Event)
  {
    //this.renderer.setStyle(this.elRef.nativeElement,'background-color','blue')
    this.backgroundColor=this.highlightColor
  }
  @HostListener('mouseleave')mouseleave(eventData:Event)
  {
   // this.renderer.setStyle(this.elRef.nativeElement,'background-color','transparent')
   this.backgroundColor=this.defaultColor
  }


}
